 package com.example.user1.androidassignment72;
/*
 Thisn project is just to show how to open contact list in our app
 */


//Required imported.
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


 // class started
 public class MainActivity extends AppCompatActivity {
  // some private reference variables.
    private Button button;

     private  final int PICKUP=1;

    @Override
    // oncreat method works as main method
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // assinged Id to button variable.
        button= (Button) findViewById(R.id.buttonn);

        // setup on click listner to button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Inetent setup to perform action (to show the list of contacts)
                Intent i=new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                startActivityForResult(i,PICKUP);

            }
        });
    }
}//class ended
