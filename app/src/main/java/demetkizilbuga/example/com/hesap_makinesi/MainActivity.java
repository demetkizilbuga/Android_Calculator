package demetkizilbuga.example.com.hesap_makinesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText sayi1,sayi2;
    TextView sonuc;
    Button topla,cikar,bol,carp,temizle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sayi1 =(EditText)findViewById(R.id.et_birinciSayi);
        sayi2=(EditText)findViewById(R.id.et_ikinciSayi);
        sonuc=(TextView) findViewById(R.id.tv_sonuc);
        topla=(Button)findViewById(R.id.btn_topla);
        cikar=(Button)findViewById(R.id.btn_cikar);
        carp=(Button)findViewById(R.id.btn_carp);
        bol=(Button)findViewById(R.id.btn_bol);
        temizle=(Button)findViewById(R.id.btn_temizle);

      topla.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              double sayibir=Double.parseDouble(sayi1.getText().toString());
              double sayiiki=Double.parseDouble(sayi2.getText().toString());

              sonuc.setText(String.valueOf(sayibir+sayiiki));

          }
      });
      cikar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              double sayibir=Double.parseDouble(sayi1.getText().toString());
              double sayiiki=Double.parseDouble(sayi2.getText().toString());
              sonuc.setText(String.valueOf(sayibir-sayiiki));


          }
      });

      carp.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              double sayibir=Double.parseDouble(sayi1.getText().toString());
              double sayiiki=Double.parseDouble(sayi2.getText().toString());
              sonuc.setText(String.valueOf(sayibir*sayiiki));

          }
      });

      bol.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              double sayibir=Double.parseDouble(sayi1.getText().toString());
              double sayiiki=Double.parseDouble(sayi2.getText().toString());
              sonuc.setText(String.valueOf(sayibir/sayiiki));

          }
      });
      temizle.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              sayi1.setText("");
              sayi2.setText("");
              sonuc.setText("");
          }
      });
    }
}
