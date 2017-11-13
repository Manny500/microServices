import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs/Observable';

import {Faceuser} from './faceuser.interface';

@Injectable()
export class FaceuserService{
    private static readonly POST_FACEUSER_URL = '/login';
    private headers = new HttpHeaders({'Content-Type': 'application/json' });

    constructor(private http: HttpClient){}

    createFaceuser(faceuser: Faceuser): Observable<any>{ 
        return this.http.post(FaceuserService.POST_FACEUSER_URL, faceuser, {headers: this.headers});
    }

}