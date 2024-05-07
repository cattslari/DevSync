/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.LarieVini.USTJQuinta;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.format.DateTimeFormatter;


public class EventosDAO {

    void cadastrar(Eventos evento) throws Exception {
        // Especificar o comando SQL (INSERT)
        String sql = "INSERT INTO tb_eventos(nome, data_hora, local) VALUES (?, ?, ?)";

        // Estabelecer uma conexão com o banco
        try (Connection conexao = new ConnectionFactory().conectar();
             // Preparar o comando
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            // Substituir os placeholders com os valores do evento
            ps.setString(1, evento.getNome());
            // Formatar a data e hora para o formato adequado
            ps.setString(2, evento.getDataHora().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            ps.setString(3, evento.getLocal());

            // Executar o comando
            ps.executeUpdate();
        }
    }
}