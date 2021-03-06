public class ProductDB {

    public Product getProduct(String productCode) {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object
        Product product; //= new Product();

        // fill the Product object with data
//        product.setCode(productCode);
        if (productCode.equalsIgnoreCase("java")) {
        	product = new Product(productCode, "Murach's JAVA Programing", 57.50);
 //           product.setDescription("Murach's Java Programming");
 //           product.setPrice(57.50);
        } else if (productCode.equalsIgnoreCase("jsp")) {
        	product = new Product(productCode, "Murach's Java Servlets and JSP", 57.50);
//            product.setDescription("Murach's Java Servlets and JSP");
//            product.setPrice(57.50);
        } else if (productCode.equalsIgnoreCase("mysql")) {
        	product = new Product(productCode, "Murach's mysql", 54.50);
//            product.setDescription("Murach's MySQL");
//            product.setPrice(54.50);
        }else if (productCode.equalsIgnoreCase("Jon")) {
        	product = new Product(productCode, "Jon's best choices", 3.50);
//                product.setDescription("Jon's best choices");
//                product.setPrice(3.50);
        } else {
        	product = new Product(productCode, "Unknown", 0.0);
//            product.setDescription("Unknown");
        }
        return product;
    }
}