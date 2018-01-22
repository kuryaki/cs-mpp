package lesson6.lecture.javafx.tables;


import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShoppingCartWindow extends Stage {
	public final static ShoppingCartWindow INSTANCE = new ShoppingCartWindow();
	private TableView<ShoppingCart> table = new TableView<ShoppingCart>();
	ProductDetailsWindow prodDetailsWindow;
	Product selectedProduct;
	Text messageBar = new Text();
	
	public void setData(ObservableList<ShoppingCart> items) {
		ObservableList<ShoppingCart> current = table.getItems();
		if(current != null) {
			current.addAll(items);
		}
		table.setItems(current);
	}
	@SuppressWarnings("unchecked")
	public ShoppingCartWindow() {
		setTitle("Shopping Cart");
		messageBar.setFill(Color.FIREBRICK);
		
		final Label label = new Label(String.format("Shopping Cart"));
        label.setFont(new Font("Arial", 16));
        HBox labelHbox = new HBox(10);
        labelHbox.setAlignment(Pos.CENTER);
        labelHbox.getChildren().add(label);
		
        table.setEditable(false);
		TableColumn<ShoppingCart, String> itemNameCol 
		  = new TableColumn<>(String.format("Item Name"));
		itemNameCol.setMinWidth(200);
		itemNameCol.setCellValueFactory(
            new PropertyValueFactory<ShoppingCart, String>("itemName"));
		itemNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
		itemNameCol.setEditable(false);
		
		TableColumn<ShoppingCart, String> quantityCol 
		  = new TableColumn<>("Quantity");
		quantityCol.setMinWidth(80);
		quantityCol.setCellValueFactory(
          new PropertyValueFactory<ShoppingCart, String>("quantity"));
		quantityCol.setCellFactory(TextFieldTableCell.forTableColumn());
		
		TableColumn<ShoppingCart, String> unitPriceCol 
		  = new TableColumn<>(String.format("Unit Price"));
		unitPriceCol.setMinWidth(80);
		unitPriceCol.setEditable(false);
		unitPriceCol.setCellValueFactory(
          new PropertyValueFactory<ShoppingCart, String>("price"));
		unitPriceCol.setCellFactory(TextFieldTableCell.forTableColumn());
		
		TableColumn<ShoppingCart, String> totalPriceCol 
		  = new TableColumn<>(String.format("Total Price"));
		totalPriceCol.setMinWidth(80);
		totalPriceCol.setEditable(false);
		totalPriceCol.setCellValueFactory(
		          new PropertyValueFactory<ShoppingCart, String>("totalPrice"));
		totalPriceCol.setCellFactory(TextFieldTableCell.forTableColumn());
		
		table.getColumns().addAll(itemNameCol, quantityCol, unitPriceCol, totalPriceCol);
		
		Button proceedButton = new Button("Proceed to Checkout");
		Button continueButton = new Button("Continue Shopping");
		Button saveButton = new Button("Save Cart");
		Button printCartButton = new Button("Print Cart");
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10); 
		grid.setHgap(10);
		grid.add(labelHbox, 0, 0);
		grid.add(table, 0, 1);
		grid.add(messageBar, 0, 2);
		HBox btnBox = new HBox(10);
		btnBox.setAlignment(Pos.CENTER);
		btnBox.getChildren().add(proceedButton);
		btnBox.getChildren().add(continueButton);
		btnBox.getChildren().add(saveButton);
		btnBox.getChildren().add(printCartButton);
		grid.add(btnBox,0,4);
		grid.add(new HBox(10), 0, 5);
		  
		printCartButton.setOnAction(evt -> {
			System.out.println(table.getItems());
		});
		continueButton.setOnAction(evt -> {
			CatalogListWindow.INSTANCE.show();
			messageBar.setText("");
			hide();
		});
		
		saveButton.setOnAction(evt -> {
			messageBar.setText("This needs to be implemented...");
			hide();
		});
	
		//proceedButton.setOnAction(evt -> {
			
  
        Scene scene = new Scene(grid, GuiConstants.SCENE_WIDTH, GuiConstants.SCENE_HEIGHT);  
		setScene(scene);
	}
	public void setShoppingCartWindowData(ProductDetailsWindow prodDetails, 
			Product selectedProd) {
		this.prodDetailsWindow = prodDetails;
		this.selectedProduct = selectedProd;
		
	}
}
