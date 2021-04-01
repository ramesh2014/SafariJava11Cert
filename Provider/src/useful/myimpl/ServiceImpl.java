package useful.myimpl;

import useful.service.ServiceAPI;

public class ServiceImpl implements ServiceAPI {

  @Override
  public String getAServiceMessage() {
    return "This is a service message!";
  }
}
