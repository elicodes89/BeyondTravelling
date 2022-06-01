import React, { useState, useEffect } from 'react';


function Home () {

return (
   <>
    <div className='title'>
    <h1>Welcome to Beyond Travelling</h1>
    <h2>Your travel app for accessible holidays</h2>
    </div>
    
    <div className='flex-container'>

{/* have clickable images as hyperlink */}
    <a href='src/components/bsl/BSL.js'><img className="bsl_sign" src={require("../access_icons/signing1.jpeg")} alt='Signing'/></a>
    <a href='src/components/wheelchair/AccessibleHotels.js'><img className="wheelchair" src={require("../access_icons/wheelchair.jpeg")} alt='Wheelchair'/></a>
    </div>

      
    <footer>2022 - Created by Annika, Eli and Mate - </footer>
    </>
  );
}
  export default Home;