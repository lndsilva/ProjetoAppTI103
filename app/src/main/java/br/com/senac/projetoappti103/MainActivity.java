package br.com.senac.projetoappti103;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

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
    String notas[] = {"12", "3.579", "43", "18.834", "1.527", "1.279", "10.899", "1", "43", "1.279"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstFilmes = findViewById(R.id.listaFilmes);

        //instânciar o adaptador
        MyAdapter adapter = new MyAdapter();

        lstFilmes.setAdapter(adapter);

        lstFilmes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //abrindo outra janela e passando os valores
                Intent intent = new Intent(getApplicationContext(),MostrarFilmesActivity.class);

                intent.putExtra("titulo",titulo[i]);
                intent.putExtra("ano",ano[i]);
                intent.putExtra("classificacao",classificacao[i]);
                intent.putExtra("notas",notas[i]);
                intent.putExtra("imagemFilme",imgFilmes[i]);

                startActivity(intent);
            }
        });


    }

    //criando uma classe interna inner class
    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imgFilmes.length;
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
            //Criando as variáveis globais para os componentes
            ImageView imageFilmes;
            TextView txtTitulo, txtAno, txtClassificacao, txtNotas;

            //Instânciando e carregando o modelo ao adaptador
            View view1 = getLayoutInflater().inflate(R.layout.modelo_filmes, null);

            //Declarando o xml para o java

            txtTitulo = view1.findViewById(R.id.txtModeloTitulo);
            txtAno = view1.findViewById(R.id.txtModeloAno);
            txtClassificacao = view1.findViewById(R.id.txtModeloClassificacao);
            txtNotas = view1.findViewById(R.id.txtModeloNotas);
            imageFilmes = view1.findViewById(R.id.imgModeloFilme);

            //Passando os valores para os componentes do modelo
            txtTitulo.setText(titulo[i]);
            txtAno.setText(ano[i]);
            txtClassificacao.setText(classificacao[i]);
            txtNotas.setText(notas[i]);

            imageFilmes.setImageResource(imgFilmes[i]);

            return view1;
        }
    }
}