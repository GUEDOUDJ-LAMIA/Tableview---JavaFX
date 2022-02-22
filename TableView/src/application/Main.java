package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	private final 	TableView <Person> table= new TableView <Person>();
	HBox hbox=new HBox();
	VBox vbox=new VBox();
	private final ObservableList <Person> data= FXCollections.observableArrayList(
			new Person("Lamia", "Guedoudj", "lamia.guedoudj@gmail.com", "Female", "17-04-1998"),
			new Person("Ibtissem", "Guedoudj", "ibtissem.guedoudj@gmail.com", "Female", "11-02-1988"),
			new Person("Rana", "smaai", "rana.smaai@hotamil.com", "Female", "13-07-2015"),
			new Person("Tinhinan", "smaai", "tininouch@gmail.com", "Female", "22-03-2018")
			
			);			

	@Override
	public void start(Stage primaryStage) {
		try {

			Scene scene = new Scene(new Group());
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Table View");
			primaryStage.setHeight(470);
			primaryStage.setWidth(850);
			/**************************************************************************/
			table.setEditable(true);
			table.prefHeight(300);
			/************************* Affichage de colonnes ************************/
			TableColumn<Person, String> firstnamecol = new TableColumn<Person, String>("First Name ");
			firstnamecol.setMinWidth(100);
			firstnamecol.setCellValueFactory(new PropertyValueFactory("FirstName"));
			firstnamecol.setCellFactory(TextFieldTableCell.<Person>forTableColumn());
			firstnamecol.setOnEditCommit((CellEditEvent<Person, String> t) -> {
				((Person) t.getTableView().getItems().get(t.getTablePosition().getRow())).setFirstName(t.getNewValue());

			});

			TableColumn<Person, String> lastnamecol = new TableColumn<Person, String>("Last Name ");
			lastnamecol.setMinWidth(100);
			lastnamecol.setCellValueFactory(new PropertyValueFactory("LastName"));
			lastnamecol.setCellFactory(TextFieldTableCell.<Person>forTableColumn());
			lastnamecol.setOnEditCommit((CellEditEvent<Person, String> t) -> {
				((Person) t.getTableView().getItems().get(t.getTablePosition().getRow())).setLastName(t.getNewValue());

			});

			TableColumn<Person, String> emailcol = new TableColumn<Person, String>("Email ");
			emailcol.setMinWidth(200);
			emailcol.setCellValueFactory(new PropertyValueFactory("Email"));
			emailcol.setCellFactory(TextFieldTableCell.<Person>forTableColumn());
			emailcol.setOnEditCommit((CellEditEvent<Person, String> t) -> {
				((Person) t.getTableView().getItems().get(t.getTablePosition().getRow())).setEmail(t.getNewValue());

			});

			TableColumn<Person, String> gendercol = new TableColumn<Person, String>("Gender ");
			gendercol.setMinWidth(100);
			gendercol.setCellValueFactory(new PropertyValueFactory("gender"));
			gendercol.setCellFactory(TextFieldTableCell.<Person>forTableColumn());
			gendercol.setOnEditCommit((CellEditEvent<Person, String> t) -> {
				((Person) t.getTableView().getItems().get(t.getTablePosition().getRow())).setGender(t.getNewValue());

			});

			TableColumn<Person, String> brithdatecol = new TableColumn<Person, String>("Brith Date ");
			brithdatecol.setMinWidth(100);
			brithdatecol.setCellValueFactory(new PropertyValueFactory("birthdate"));
			brithdatecol.setCellFactory(TextFieldTableCell.<Person>forTableColumn());
			brithdatecol.setOnEditCommit((CellEditEvent<Person, String> t) -> {
				((Person) t.getTableView().getItems().get(t.getTablePosition().getRow())).setBrithData(t.getNewValue());

			});

			table.getColumns().addAll(firstnamecol, lastnamecol, emailcol, gendercol, brithdatecol);
			table.setItems(data);
			hbox.getChildren().add(table);
			((Group) scene.getRoot()).getChildren().addAll(hbox);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
