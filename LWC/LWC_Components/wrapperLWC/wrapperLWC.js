import { LightningElement } from 'lwc';
import returnList from '@salesforce/apex/WrapperDemo.returnList';
export default class WrapperLWC extends LightningElement {

    searchString;
    receivedData;
    contactList;
    oppsList;
    inputHandler(event) {
        this.searchString = event.target.value;
        console.log('searchTerm: ', this.searchString);
    }


    searchHandler() {

        returnList({ inputName: this.searchString }).then(response => {
            this.receivedData = response;
            console.log('Response: ', this.receivedData);
            for(let key in this.receivedData){
                console.log(key, this.receivedData[key]);
                //this.contactList = this.receivedData[key];
                //console.log('contactList: ', this.contactList);
            }
            this.contactList = this.receivedData.cList;
            this.oppsList = this.receivedData.oppsList;
            //let temp = JSON.stringify(this.receivedData);
           // this.contactList
            console.log('Contacts: ', this.contactList);
            console.log('Opportunity: ', this.oppsList);

        }).catch(error => {
            console.log('Error: ', error.body.message);
            console.log('Error Obj: ', error);
        })
    }

}