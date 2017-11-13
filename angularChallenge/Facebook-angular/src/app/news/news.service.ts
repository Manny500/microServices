import { News } from "./news";
import { Http } from "@angular/http";
import { Injectable } from "@angular/core";
import 'rxjs/add/operator/toPromise';
import 'rxjs/Rx';


@Injectable()
export class NewsService {
    private newsURL = '/feed';

    constructor(private http: Http) { }

    getNews(){
        return this.http.get(this.newsURL)
        .map(response => <News[]> response.json())
        .do(data => console.log(data))
        .catch(this.handleError);
    }
    // getNews(): Promise<News[]> {
    //     return this.http.get(this.newsURL)
    //                .toPromise()
    //                .then(response => { 
    //                    console.log(response)
    //                    response.json() as News[]})
    //                .catch(this.handleError);
    //   }

      private handleError(error: any): Promise<any> {
        console.error('An error occurred', error); // for demo purposes only
        return Promise.reject(error.message || error);
      }
}