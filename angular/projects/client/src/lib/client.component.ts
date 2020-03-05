import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'lib-client',
  template: `
    <p>
      client works!
    </p>
  `,
  styles: []
})
export class ClientComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
