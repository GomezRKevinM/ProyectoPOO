# Apuntes importantes

1. Algunos productos tienen marca, precio de compra y stock, y son suministrados por uno o varios proveedores.

## Incognitas

- Cada cotización debe incluir detalles de los productos solicitados, presentados en líneas o ítems que incluyen un consecutivo.
- Al final de cada cotización se muestra el total de líneas, precios unitarios, precio por IVA, precios con IVA, descuentos, y precios con IVA y descuento.
- Unidades del producto en nota de correción.

## Methodos

### `Pedido.java`

- Verificar
  - !check -> Nota De corrección
- Almacenar
- actualizar stock
- calcular precio del producto = (PrecioUnitarioActual - PrecioUnitarioAnterior)*35%
- Guardar Copia de comprobante de pago