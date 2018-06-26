package com.alsabha.fci.activeandroidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    EditText name , author , search;
    TextView details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        author = findViewById(R.id.author);
        details = findViewById(R.id.details);
        search  = findViewById(R.id.search);
    }

    public void savebtn_Clicked(View view) {

        Book book = new Book();
        book.name = name.getText().toString();
        book.author = author.getText().toString();
        book.save();

    }
    int num = 0;
    public void getDatabtn_Clicked(View view) {
        details.setText("Details "+num+":\n");
        List<Book> books;
        if (search.equals(""))
            books = Book.getAll();
        else
            books = Book.getname(details.getText().toString());
        for (Book book : books){
            details.setText("name : "+book.name+" , author : "+book.author +"\n");
        }
    }

    public void deleteDatabtn_Clicked(View view) {

    }
}
