package com.spring.contact.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.spring.contact.model.Contact;

/**
 * An implementation of the ContactDAO interface.
 *
 */
public class ContactDAOImpl implements ContactDAO {

	private JdbcTemplate jdbcTemplate;
	
	public ContactDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void saveOrUpdate(Contact contact) {
		if (contact.getId() > 0) {
			// update
			String sql = "UPDATE contact SET firstname=?,lastname=?,status=?, email=?, address=?, "
						+ "telephone=? WHERE contact_id=?";
			jdbcTemplate.update(sql, contact.getFirstname(),contact.getLastname(),contact.getStatus(), contact.getEmail(),
					contact.getAddress(), contact.getTelephone(), contact.getId());
		} else {
			// insert
			String sql = "INSERT INTO contact (firstname, lastname, status, email, address, telephone)"
						+ " VALUES (?, ?, ?, ?, ?, ?)";
			jdbcTemplate.update(sql,  contact.getFirstname(),contact.getLastname(),contact.getStatus(), contact.getEmail(),
					contact.getAddress(), contact.getTelephone());
		}
		
	}

	@Override
	public void delete(int contactId) {
		String sql = "DELETE FROM contact WHERE contact_id=?";
		jdbcTemplate.update(sql, contactId);
	}

	@Override
	public List<Contact> list() {
		String sql = "SELECT * FROM contact";
		List<Contact> listContact = jdbcTemplate.query(sql, new RowMapper<Contact>() {

			@Override
			public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
				Contact aContact = new Contact();
	
				aContact.setId(rs.getInt("contact_id"));
				aContact.setFirstname(rs.getString("firstname"));
				aContact.setLastname(rs.getString("lastname"));
				aContact.setStatus(rs.getString("status"));
				aContact.setEmail(rs.getString("email"));
				aContact.setAddress(rs.getString("address"));
				aContact.setTelephone(rs.getString("telephone"));
				
				return aContact;
			}
			
		});
		
		return listContact;
	}

	@Override
	public Contact get(int contactId) {
		String sql = "SELECT * FROM contact WHERE contact_id=" + contactId;
		return jdbcTemplate.query(sql, new ResultSetExtractor<Contact>() {

			@Override
			public Contact extractData(ResultSet rs) throws SQLException,
					DataAccessException {
				if (rs.next()) {
					Contact contact = new Contact();
					contact.setId(rs.getInt("contact_id"));
					contact.setFirstname(rs.getString("firstname"));
					contact.setLastname(rs.getString("lastname"));
					contact.setStatus(rs.getString("status"));
					contact.setEmail(rs.getString("email"));
					contact.setAddress(rs.getString("address"));
					contact.setTelephone(rs.getString("telephone"));
					return contact;
				}
				
				return null;
			}
			
		});
	}

}
