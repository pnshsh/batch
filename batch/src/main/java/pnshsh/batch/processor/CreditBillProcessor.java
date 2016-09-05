package pnshsh.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import pnshsh.batch.bean.CreditBill;


public class CreditBillProcessor implements
		ItemProcessor<CreditBill, CreditBill> {

	public CreditBill process(CreditBill bill) throws Exception {
		System.out.println(bill.toString());
		return bill;
	}
}
