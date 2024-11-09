package com.fermonva.ecommerce.service;

import com.fermonva.ecommerce.dto.PaymentInfo;
import com.fermonva.ecommerce.dto.Purchase;
import com.fermonva.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import org.springframework.stereotype.Service;

@Service
public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
