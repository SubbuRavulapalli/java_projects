package com.jdbc.dao.daoimpl;

import com.jdbc.dao.PaymentDao;
import com.jdbc.model.Payment;
import org.springframework.jdbc.core.JdbcTemplate;

public class PaymentDaoimpl implements PaymentDao {
    JdbcTemplate  jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addPayment(Payment payment) {
        String query = "insert into payment(cardType,name,cardNo,cvv)values(?,?,?,?)";
        return jdbcTemplate.update(query,payment.getCardType(),payment.getName(),payment.getCardNo(),payment.getCvv());
    }
}
