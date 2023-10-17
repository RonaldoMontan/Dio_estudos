package br.com.ronaldomontan.todolist.filter;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import at.favre.lib.crypto.bcrypt.BCrypt;
import br.com.ronaldomontan.todolist.user.IUserRepository;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class FilterTaskAuth  extends OncePerRequestFilter{

    @Autowired
    private IUserRepository userRepository;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        
        //    pega a autenticação (usuario e senha) enviada na requests
        var authorization = request.getHeader("Authorization");
        System.out.println(authorization);
        
        var authEncode = authorization.substring(5).trim();//remove a plavra basic

        byte[] authDecode = Base64.getDecoder().decode(authEncode); //a decodificação é gerada um array de bytes

        var authString = new String(authDecode); //converte para string, já é possivel ver o user e senha

        String[] credentials = authString.split(":");

        String userName = credentials[0];
        String password = credentials[1];


        //valida usuario
        var user = this.userRepository.findByUsername(userName);

        if (user == null){
            response.sendError(401, "Usuário sem autorização");
        
        } else {        
            var passwordVerify = BCrypt.verifyer().verify(password.toCharArray(), user.getPassword());
            
            if (passwordVerify.verified) {
                filterChain.doFilter(request, response);
            
            } else {
                response.sendError(401);

            }       
        }       
    }    
}
