package ifsc.slo.tecinfo.pi.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author analice
 */
@Entity
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codUsuario;
    private String nome;
    private String email;
    private String login;
    private String senha;
    @OneToMany
    private List<Jogo> jogos;

    public Usuario(int codUsuario, String nome, String email, String login, String senha) {
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public Usuario() {
    }

    public Usuario(int codUsuario, String nome, String email, String login, String senha, List<Jogo> jogos) {
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.jogos = jogos;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
   }
    
    public List<String> getRoles(){
        List<String> roles= new ArrayList<>();
        roles.add("ROLE_USER");
        return roles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

       return (Collection<? extends GrantedAuthority>) getRoles();
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {

        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
