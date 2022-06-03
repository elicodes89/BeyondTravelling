import React from 'react';
import Header from '../components/Header';



function Home () {

return (
  <>
  <Header />
    <div className='title'>
    <h2 className>Your travel app for accessible holidays</h2>
    </div>
    
    <div className='flex-container'>

{/* have clickable images as hyperlink */}
    <a href='src/components/bsl/BSL.js'><img className="bsl_sign" src={require("../access_icons/signing1.jpeg")} alt='Signing'/></a>
    <a href='src/components/wheelchair/AccessibleHotels.js'><img className="wheelchair" src={require("../access_icons/wheelchair.jpeg")} alt='Wheelchair'/></a>
    </div>
  </>

  );
};
export default Home;