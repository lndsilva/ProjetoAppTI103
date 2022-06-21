package br.com.senac.projetoappti103;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    //Declarar as variáveis globais referenciando os componentes
    ListView lstFilmes;
    //Criando os dados para a lista
    String titulo[] = {"Contractor", "Bloodshot", "Fast Five", "Turma da Mômica",
            "John Wick", "The Tomorrow War", "Spider-Man", "Joker", "Shrek 2", "Angry Birds"};
    String ano[] = {"2022", "2020", "2011", "2021", "2014", "2021", "2019", "2019", "2004", "2019"};
    String classificacao[] = {"18 anos ou mais", "13 anos ou mais", "13 anos ou mais",
            "7 anos ou mais", "18 anos ou mais", "16 anos ou mais", "13 anos ou mais",
            "18 anos ou mais", "7 anos ou mais", "7 anos ou mais"};
    int imgFilmes[] = {R.drawable.contractor, R.drawable.bloodshot, R.drawable.fast,
            R.drawable.monica, R.drawable.john, R.drawable.tomorrow,
            R.drawable.spiderman, R.drawable.joker, R.drawable.shrek,
            R.drawable.angry};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstFilmes = findViewById(R.id.listaFilmes);

        //lstFilmes.setAdapter();

    }

    //criando uma classe interna inner class
    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            return null;
        }
    }
}