/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifsc.slo.tecinfo.pi.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author analice
 */
@Entity
public class Avaliacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    private int codAvaliacao;
    private String comentario;
    private double nota;
    private int like;
    private int dislike;
    private String denunciar;
    

    public Avaliacao(int codAvaliacao, String comentario, double nota, int like, int dislike, String denunciar) {
        this.codAvaliacao = codAvaliacao;
        this.comentario = comentario;
        this.nota = nota;
        this.like = like;
        this.dislike = dislike;
        this.denunciar = denunciar;
    }

    public int getCodAvaliacao() {
        return codAvaliacao;
    }

    public void setCodAvaliacao(int codAvaliacao) {
        this.codAvaliacao = codAvaliacao;
    }
 
    
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public String getDenunciar() {
        return denunciar;
    }

    public void setDenunciar(String denunciar) {
        this.denunciar = denunciar;
    }

    
}
