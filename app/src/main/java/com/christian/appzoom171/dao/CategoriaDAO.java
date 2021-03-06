package com.christian.appzoom171.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.christian.appzoom171.model.Categoria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by android on 06/09/2018.
 */

public class CategoriaDAO {

    public static void inserir(Context contexto, Categoria categoria)  {

        Conexao conn = new Conexao(contexto);
        SQLiteDatabase banco = conn.getWritableDatabase();

        banco.execSQL("INSERT INTO categorias (nome) VALUES" + "('"+categoria.getNome()+"')");
    }
    public static List<Categoria> getCategoria(Context contexto){
        List<Categoria> listaDeCategoria = new ArrayList<>();
        Conexao conn = new Conexao(contexto);
        SQLiteDatabase banco = conn.getReadableDatabase();

        Cursor tabela = banco.rawQuery("SELECT * FROM categorias", null);
        if ( tabela.getCount() > 0 ){
            tabela.moveToFirst();

            do {
                Categoria cat = new Categoria();
                cat.setId( tabela.getInt(0) );
                cat.setNome( tabela.getString(1) );

                listaDeCategoria.add(cat);

            }while(tabela.moveToNext());


        }



        return listaDeCategoria;
    }
}
