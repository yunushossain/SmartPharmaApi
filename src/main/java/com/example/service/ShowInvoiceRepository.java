package com.example.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.ShowInvoice;

@Repository
public interface ShowInvoiceRepository extends JpaRepository<ShowInvoice, Long> {

}
