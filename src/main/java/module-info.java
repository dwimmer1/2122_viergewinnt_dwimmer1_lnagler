module com.example.viergewinnt_dwimmer1_lnagler1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.viergewinnt_dwimmer1_lnagler1 to javafx.fxml;
    exports com.example.viergewinnt_dwimmer1_lnagler1;
}