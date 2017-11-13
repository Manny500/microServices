import { Component, OnInit, ViewEncapsulation } from '@angular/core';

import {FormsModule} from '@angular/forms';

import {Faceuser} from '../faceuser.interface';
import {FaceuserService} from '../faceuser.service';
import {Router, CanActivate} from '@angular/router'

@Component({
  selector: 'faceuser-form',
  templateUrl: './faceuser-form.component.html',
  styleUrls: ['./faceuser-form.component.css'],
  encapsulation: ViewEncapsulation.None
})

export class FaceuserFormComponent implements OnInit {

  faceuser: Faceuser = {faceId: null, faceUsername: '', facePassword: ''};
  constructor(private faceuserService: FaceuserService, private router: Router) {}

  ngOnInit() {
  }

  onSubmit(){
    this.faceuserService.createFaceuser(this.faceuser).subscribe(
      value => {
        console.log(value);
        if(value.faceId != 0){
          //redirect to news
          // this.router.navigate(['/news']);
          this.router.navigateByUrl('/news');
        }else{
          //refresh login
          this.router.navigate(['/login']);
        }
      }, error => {
        console.log('FAIL !');
      },
      () => {
        console.log('POST Faceuser - now completed.');
      });
  }

}
