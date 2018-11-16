package fr.goffa.pizzeria.pizza.domain;

public class Pizza {
   private String nom;
   private Double prix;
public Pizza() {
	super();
	// TODO Auto-generated constructor stub
}
public Pizza(String nom, Double prix) {
	super();
	this.nom = nom;
	this.prix = prix;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Double getPrix() {
	return prix;
}
public void setPrix(Double prix) {
	this.prix = prix;
}
   

}
