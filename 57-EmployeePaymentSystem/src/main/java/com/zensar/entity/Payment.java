package com.zensar.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="PAYMENT_TB")
public class Payment {

@Id
@GeneratedValue
private int paymentId;
private String paymentStatus;
private String transactionId;
public int getPaymentId() {
return paymentId;
}
public void setPaymentId(int paymentId) {
this.paymentId = paymentId;
}
public String getPaymentStatus() {
return paymentStatus;
}
public void setPaymentStatus(String paymentStatus) {
this.paymentStatus = paymentStatus;
}
public String getTransactionId() {
return transactionId;
}
public void setTransactionId(String transactionId) {
this.transactionId = transactionId;
}
public Payment(int paymentId, String paymentStatus, String transactionId) {
super();
this.paymentId = paymentId;
this.paymentStatus = paymentStatus;
this.transactionId = transactionId;
}
public Payment() {
super();
}





}