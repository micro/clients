import { TestBed } from "@angular/core/testing";
import {
  HttpClientTestingModule,
  HttpTestingController
} from "@angular/common/http/testing";
import { HttpClientModule } from "@angular/common/http";
import { ClientService } from "./client.service";

describe("ClientService", () => {
  let service: ClientService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule]
    });
    service = TestBed.inject(ClientService);
  });

  it("should be created", async () => {
    expect(service).toBeTruthy();
    const rsp = await service.call("go.micro.srv.greeter", "Say.Hello", {
      name: "John"
    });
    expect(rsp["msg"]).toBe("Hello John2");
  });
});
