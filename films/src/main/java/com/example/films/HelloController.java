package com.example.films;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        rang_table.setCellValueFactory(new PropertyValueFactory<Film,String>("rang"));
        id_table.setCellValueFactory(new PropertyValueFactory<Film,String>("id"));
        nom_table.setCellValueFactory(new PropertyValueFactory<Film,String>("nom"));
        annee_table.setCellValueFactory(new PropertyValueFactory<Film,String>("annee"));
        acteur_table.setCellValueFactory(new PropertyValueFactory<Film,String>("acteur"));
    }
    public void ajouterFilmDansTableau(Integer rang, String id, String nom, Integer annee, String acteur) {
        Film film = new Film();

        film.setRang(rang);
        film.setId(id);
        film.setNom(nom);
        film.setAnnee(annee);
        film.setActeur(acteur);

        ObservableList<Film> films = tableau.getItems();
        films.add(film);
        tableau.setItems(films);
    }

    public void SupprimerFilmDansTableau() {
        ObservableList<Film> films = tableau.getItems();
        films.clear();
        tableau.setItems(films);
    }

    public void deleteOne() {
        ObservableList<Film> filmSelect = tableau.getSelectionModel().getSelectedItems();
        tableau.getItems().remove(filmSelect);
    }

    @FXML
    private void ajouterFilm(){
        ajouterFilmDansTableau(Integer.valueOf(rang_text.getText()),id_text.getText(), nom_text.getText(), Integer.valueOf(annee_text.getText()),acteur_text.getText());
        rang_text.setText("");
        id_text.setText("");
        nom_text.setText("");
        annee_text.setText("");
        acteur_text.setText("");
    };
    @FXML
    private void supprimerFilm(){
        SupprimerFilmDansTableau();
    };
    @FXML
    private void supprimerUnFilm(){
        deleteOne();
    };
    @FXML
    public TextField rang_text;
    @FXML
    public TextField id_text;
    @FXML
    public TextField nom_text;
    @FXML
    public TextField annee_text;
    @FXML
    public TextField acteur_text;
    @FXML
    public TableColumn rang_table;
    @FXML
    public TableColumn id_table;
    @FXML
    public TableColumn nom_table;
    @FXML
    public TableColumn annee_table;
    @FXML
    public TableColumn acteur_table;
    @FXML
    public TableView tableau;
    @FXML
    public Button ajout_button;
    @FXML
    public Button supprimer_button;
    @FXML
    public Button supprimer_button1;
}
