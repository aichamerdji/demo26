package com.example.demo26.dal;

import com.example.demo26.domain.Coupon;
import org.springframework.data.repository.CrudRepository;

public interface CouponDAO extends CrudRepository<Coupon, Long> {
}
