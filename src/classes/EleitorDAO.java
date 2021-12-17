package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EleitorDAO {

    String sSql;
    Connection con;
    PreparedStatement pstmt;

    public Eleitor consultarEleitorPorTitulo(String titulo) {

        ResultSet rs;
        Eleitor a;
        a = new Eleitor();

        sSql = "SELECT ele_titulo, ele_zona, ele_nome, ele_dataNasc, ele_secao, ele_votou, ele_cidade, ele_estado, ele_foto FROM eleitor WHERE ele_titulo = ?";
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, titulo);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                a = new Eleitor();

                a.setTitulo(rs.getString("ele_titulo"));
                a.setZona(rs.getString("ele_zona"));
                a.setNome(rs.getString("ele_nome"));
                a.setDataNasc(rs.getString("ele_dataNasc"));
                a.setSecao(rs.getString("ele_secao"));
                a.setVotou(rs.getString("ele_votou"));
                a.setCidade(rs.getString("ele_cidade"));
                a.setEstado(rs.getString("ele_estado"));
                a.setFoto(rs.getString("ele_foto"));
               

            }
            pstmt.close();
            con.close();
        } catch (SQLException erro) {
            System.out.println("Eleitor não encontrado..." + erro.getMessage());
        }
        return a;
    }

    public void attVotoEleitor(String titulo){
        
        sSql = "UPDATE eleitor SET ele_votou = 'S' WHERE ele_titulo = ?";
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, titulo);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
        }
        
    }
}
