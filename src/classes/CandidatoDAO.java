package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CandidatoDAO {

    String sSql;
    Connection con;
    PreparedStatement pstmt;

    public Candidato consultarCandidatoPorNumero(String numero) {

        ResultSet rs;
        Candidato a;
        a = new Candidato();
        con = null;

        sSql = "SELECT can_nome, can_partido, can_vice, can_foto, can_fotovice FROM candidato WHERE can_numero = ?";
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, numero);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                a.setNome(rs.getString("can_nome"));
                a.setPartido(rs.getString("can_partido"));
                a.setVice(rs.getString("can_vice"));
                a.setFoto(rs.getString("can_foto"));
                a.setFotovice(rs.getString("can_fotovice"));

            } else {
                a = null;
            }
            pstmt.close();
            con.close();
            rs.close();
        } catch (SQLException erro) {
            System.out.println("Eleitor não encontrado..." + erro.getMessage());
        }
        return a;
                }

    public void attCandidatoPorNumero(String numero) {

        sSql = "UPDATE candidato SET can_votos = can_votos + 1 WHERE can_numero = ?";
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, numero);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao contabilizar o voto");
        }

    }

    public void attVotoBranco() {
        sSql = "UPDATE candidato SET can_votos = can_votos + 1 WHERE can_nome = 'Voto em branco'";
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            //pstmt.setString(1, numero);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao contabilizar o voto");
        }

    }

    public List<Candidato> listarCandidatos() {
        List listadeCandidatos = new ArrayList();
        ResultSet rs;
        Candidato a;
        sSql = "SELECT can_numero, can_nome, can_votos FROM candidato WHERE can_numero >= 0 ORDER BY can_votos DESC";
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                a = new Candidato();
                a.setNumero(rs.getInt("can_numero"));
                a.setNome(rs.getString("can_nome"));
                a.setVotos(rs.getString("can_votos"));

                listadeCandidatos.add(a);

            }
        } catch (SQLException erro) {
            listadeCandidatos = null;

        }
        return listadeCandidatos;
    }

}
