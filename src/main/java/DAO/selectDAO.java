package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import DTO.RequestDTO;
import DTO.ResponseDTO;

@Service
public class selectDAO
{
	static Connection con = null;
	static {
		con = ConnectionClass.myConnection();
	}
	public List<ResponseDTO> selectOne(RequestDTO dto)
	{
		List<ResponseDTO> list = new ArrayList();
		String sql = "select p.name,p.price,c.category_name from product as p inner join category as c on p.cat_id = c.category_id where category_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getCategoryId());
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				ResponseDTO res = new ResponseDTO();
				res.setName(rs.getString("name"));
				res.setPrice(rs.getString("price"));
				res.setCategoryName(rs.getString("category_name"));
				list.add(res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public List<ResponseDTO> selectAll()
	{
		List<ResponseDTO> list = new ArrayList();
		String sql = "select * from category";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				ResponseDTO res = new ResponseDTO();
				res.setCategoryId(rs.getInt("category_id"));
				res.setCategoryName(rs.getString("category_name"));
				list.add(res);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
