package eu.trixcms.trixcore.example;

import eu.trixcms.trixcore.api.method.IMethod;
import eu.trixcms.trixcore.api.method.annotation.MethodName;
import eu.trixcms.trixcore.api.response.IResponse;
import eu.trixcms.trixcore.common.response.SuccessResponse;

@MethodName(name = "example_method")
public class ExampleMethod implements IMethod {

    @Override
    public IResponse exec(String[] strings) {
        return new SuccessResponse("Hello from example method !");
    }
}
