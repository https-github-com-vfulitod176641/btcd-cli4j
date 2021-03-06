package com.neemre.btcdcli4j.daemon.event;

import java.util.Observable;
import java.util.Observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.Getter;

import com.neemre.btcdcli4j.core.domain.Transaction;

/**An abstract adapter class for receiving {@code WALLET} notifications. Extend this class to 
 * override any methods of interest.*/
public abstract class WalletListener {

	private static final Logger LOG = LoggerFactory.getLogger(WalletListener.class);

	@Getter
	private Observer observer;


	public WalletListener() {
		observer = new Observer() {
			@Override
			public void update(Observable monitor, Object cause) {
				Transaction transaction = (Transaction)cause;
				LOG.trace("-- update(..): forwarding incoming 'WALLET' notification to "
						+ "'walletChanged(..)'");
				walletChanged(transaction);
			}
		};
	}

	public void walletChanged(Transaction transaction) {}
}