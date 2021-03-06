package external

import model.DomainModel

import scalaz.concurrent.Task
import model.DomainModel._

sealed trait TeamThreeCacheApi[K, V] {
  def get: K => Task[Option[V]]
  def put: K => V => Task[Unit]
}

object TeamThreeCacheApi extends TeamThreeCacheApi[ProductId, Product] {
  def get: DomainModel.ProductId => Task[Option[DomainModel.Product]] = ???
  def put: ProductId => Product => Task[Unit] = ???
}