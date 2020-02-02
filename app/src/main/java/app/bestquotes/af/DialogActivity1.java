package app.bestquotes.af;

import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DialogActivity1 extends AppCompatActivity {

    AlertDialog dialogcourseMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog1);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final AlertDialog.Builder dialog1=new AlertDialog.Builder(DialogActivity1.this);
                dialog1.setTitle("Class 101");

                final View viewdialog= LayoutInflater.from(DialogActivity1.this).inflate(R.layout.information_dialog,null);

                dialog1.setView(viewdialog);


                Button btnSave=viewdialog.findViewById(R.id.btnSave);
                btnSave.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(DialogActivity1.this, "Done", Toast.LENGTH_SHORT).show();
                        dialogcourseMessage.dismiss();

                    }
                });

                 dialogcourseMessage=dialog1.create();

                dialogcourseMessage.show();





            }
        });
    }

    private void showDialog() {
        AlertDialog.Builder dialog1=new AlertDialog.Builder(DialogActivity1.this);
        dialog1.setTitle("Class 101");
        dialog1.setMessage("Did you developed the Best Project ?");


        dialog1.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               dialog.cancel();
            }
        });

        dialog1.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(DialogActivity1.this, "You have 1 more days to complete it", Toast.LENGTH_SHORT).show();

                dialog.cancel();
            }
        });

        AlertDialog dialogcourseMessage=dialog1.create();

        dialogcourseMessage.show();
    }


}
