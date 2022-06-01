import React from 'react';
import Header from '../components/Header';


function Home () {

return (
   <>
   <Header />
    <div className='title'>
    <h2>Your travel app for accessible holidays</h2>
    </div>
    
    <div className='flex-container'>
    <img className="bsl_sign" src={require("../access_icons/signing1.jpeg")} alt='Signing'/>
    <img className="wheelchair" src={require("../access_icons/wheelchair.jpeg")} alt='Wheelchair'/>
    </div>
    </>
    
  );
}
  export default Home;