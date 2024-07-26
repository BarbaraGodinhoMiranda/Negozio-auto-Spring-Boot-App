package com.example.demo;

public class auto {
	
	private String modello;
	private String marca;
	private String tipologia;
	private double prezzo;
	private String img;
	public String getImg() {
		return img;
	}
	
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipologia() {
		return tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public String toString() {
		return "auto [modello=" + modello + ", marca=" + marca + ", tipologia=" + tipologia + ", prezzo=" + prezzo
				+ "]";
	}

	public void setImg(String img) {
		this.img = img;
		
	}
	

}

