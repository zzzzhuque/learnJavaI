范型注意事项

- 不能写List<int>，因为类型参数不能是基本类型

- 不同类型参数的范型类getClass都返回原始类型

- 不能创建参数化类型的数组，`new Pair<String>[10]`

- 由上一条，向参数个数可变的方法传递范型类型实例的时候，要加上@(SusppendWarnings("unchecked"))避免Warning

- 不能实例化类型变量，也就是不能写`new T()`

- 不能构造范型数组，也就是不能写`new T[2]`