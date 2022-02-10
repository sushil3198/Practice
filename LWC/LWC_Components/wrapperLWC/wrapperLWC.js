import { LightningElement } from 'lwc';
import returnList from '@salesforce/apex/WrapperDemo.returnList';
export default class WrapperLWC extends LightningElement {

    searchString;
    receivedData;
    contactList;
    oppsList;
    genericObject = {};
    mergedObj;

    inputHandler(event) {
        this.searchString = event.target.value;
        console.log('searchTerm: ', this.searchString);
    }

    searchHandler() {
        returnList({ inputName: this.searchString }).then(response => {
            this.receivedData = response;
            console.log('Response: ', this.receivedData);
            this.contactList = this.receivedData.cList;
            this.oppsList = this.receivedData.oppsList;
            console.log('Contacts: ', this.contactList);
            console.log('Opportunity: ', this.oppsList);
            for(let key in this.contactList){
                this.genericObject[key] = {name : this.contactList[key].LastName}
            }

            for(let key in this.oppsList){
                this.genericObject[key] = {name : this.oppsList[key].Name, recordId : this.oppsList[key].Id}
            }
            console.log('generic',this.genericObject);

            this.mergedObj = this.oppsList.concat(this.contactList);
            console.log(this.mergedObj);

           // Object.
        }).catch(error => {
            console.log('Error: ', error.body.message);
            console.log('Error Obj: ', error);
        })
    }

    

    

}