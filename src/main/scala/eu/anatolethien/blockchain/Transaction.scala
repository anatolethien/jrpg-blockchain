package eu.anatolethien.blockchain

/** Implementation of an economic transaction between two parties.
 *  @param emitter the emitter's identifier
 *  @param receiver the receiver's identifier
 *  @param amount the amount of the transaction
 */
class Transaction(val emitter: Int, val receiver: Int, val amount: Int) {

  /** String representation of the transaction as a CSV
   *  @return a string representation of the transaction as a CSV.
   *  @example `Transaction(2, 3, 10).toCsv() = "2,3,10"`
   */
  def toCsv: String = {
    List(emitter, receiver, amount).mkString(",")
  }

  override def toString: String = toCsv

}
