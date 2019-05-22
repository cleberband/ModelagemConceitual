package com.cbm.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.cbm.cursomc.domain.Pedido;

public interface EmailService {
	
	 void sendOrderConfirmationEmail(Pedido obj);
	 
	 void sendEmail(SimpleMailMessage msg);

}
