/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tikape.runko.domain;

/**
 *
 * @author jpssilve
 */
public class SmoothieRaakaAine {
    
    private Integer id;
    private Integer smoothie_id;
    private Integer raaka_aine_id;
    private String jarjestys;
    private String maara;
    private String ohje;
    
    public SmoothieRaakaAine(Integer id, Integer smoothie_id, Integer raaka_aine_id, String jarjestys, String maara, String ohje) {
        this.id = id;
        this.smoothie_id = smoothie_id;
        this.raaka_aine_id = raaka_aine_id;
        this.jarjestys = jarjestys;
        this.maara = maara;
        this.ohje = ohje;
    }
    
    public SmoothieRaakaAine() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSmoothie_id(Integer smoothie_id) {
        this.smoothie_id = smoothie_id;
    }

    public void setRaaka_aine_id(Integer raaka_aine_id) {
        this.raaka_aine_id = raaka_aine_id;
    }

    public void setJarjestys(String jarjestys) {
        this.jarjestys = jarjestys;
    }

    public void setMaara(String maara) {
        this.maara = maara;
    }

    public void setOhje(String ohje) {
        this.ohje = ohje;
    }

    public Integer getSmoothieId() {
        return smoothie_id;
    }

    public Integer getRaaka_aineId() {
        return raaka_aine_id;
    }

    public String getJarjestys() {
        return jarjestys;
    }

    public String getMaara() {
        return maara;
    }

    public String getOhje() {
        return ohje;
    }
    
     public Integer getId() {
        return id;
    }
}
