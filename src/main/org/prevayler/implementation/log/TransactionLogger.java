//Prevayler(TM) - The Open-Source Prevalence Layer.
//Copyright (C) 2001-2003 Klaus Wuestefeld.
//This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public License version 2.1 as published by the Free Software Foundation. This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details. You should have received a copy of the GNU Lesser General Public License along with this library; if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA.

package org.prevayler.implementation.log;

import java.io.IOException;
import java.util.Date;

import org.prevayler.Transaction;
import org.prevayler.implementation.TransactionSubscriber;

/**
 * @author ALEXANDRE LUIS
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public interface TransactionLogger {
	public abstract void log(Transaction transaction, Date executionTime);
	/** If there are no log files in the directory (when a snapshot is taken and all log files are manually deleted, for example), the initialTransaction parameter in the first call to this method will define what the next transaction number will be. We have to find clearer/simpler semantics.
	 */
	public abstract void update(
		TransactionSubscriber subscriber,
		long initialTransaction)
		throws IOException, ClassNotFoundException;
}