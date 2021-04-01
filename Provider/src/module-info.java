/*open */module Provider {
//  exports useful to Client;
//  opens useful to Client;
  exports useful;
  exports useful.service;
  opens useful;
  provides useful.service.ServiceAPI with useful.myimpl.ServiceImpl;
}
