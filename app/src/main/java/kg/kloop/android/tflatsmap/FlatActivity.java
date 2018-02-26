package kg.kloop.android.tflatsmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FlatActivity extends AppCompatActivity {

    EditText addressEditText;
    EditText priceEditText;
    Button saveButton;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    double lat;
    double lng;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat);

        addressEditText = findViewById(R.id.address_edit_text);
        priceEditText = findViewById(R.id.price_edit_text);
        saveButton = findViewById(R.id.save_button);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("Flats");

        Intent intent = getIntent();
        lat = intent.getDoubleExtra("lat", 0);
        lng = intent.getDoubleExtra("lng", 0);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String address = addressEditText.getText().toString();
                String price = priceEditText.getText().toString();
                Flat flat = new Flat(address, price, lat, lng);
                flat.setId(databaseReference.push().getKey());
                databaseReference.child(flat.getId()).setValue(flat);
                finish();

            }
        });


    }
}
