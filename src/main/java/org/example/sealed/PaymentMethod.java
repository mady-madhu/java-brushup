package org.example.sealed;

public sealed class PaymentMethod permits Card,UPI,Cash{
    public void pay(){

    }
}
