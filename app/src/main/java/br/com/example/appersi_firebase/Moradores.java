package br.com.example.appersi_firebase;

public class Moradores {
    private String id_txt;
    private String nome_txt;
    private String bloco_txt;
    private String ap_txt;
    // Construtores

    public Moradores(String id_txt, String nome_txt, String bloco_txt, String ap_txt) {
        this.id_txt = id_txt;
        this.nome_txt = nome_txt;
        this.bloco_txt = bloco_txt;
        this.ap_txt = ap_txt;
    }


// Gets and Sets


    public String getId_txt() {
        return id_txt;
    }

    public void setId_txt(String id_txt) {
        this.id_txt = id_txt;
    }

    public String getNome_txt() {
        return nome_txt;
    }

    public void setNome_txt(String nome_txt) {
        this.nome_txt = nome_txt;
    }

    public String getBloco_txt() {
        return bloco_txt;
    }

    public void setBloco_txt(String bloco_txt) {
        this.bloco_txt = bloco_txt;
    }

    public String getAp_txt() {
        return ap_txt;
    }

    public void setAp_txt(String ap_txt) {
        this.ap_txt = ap_txt;
    }
}
