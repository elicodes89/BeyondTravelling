import React, { useState, useEffect } from 'react';
<<<<<<< HEAD
// import HotelList from '../components/bsl/HotelList';
// import HotelDetail from '../components/bsl/HotelDetail';
// import HotelDetail from '../components/wheelchair/HotelDetail';
// import HotelList from '../components/wheelchair/HotelList';
// import AccessibleHotels from '../components/wheelchair/AccessibleHotels';
import video from '/Users/annikaneumann/codeclan_work/BeyondTravelling/beyond_travelling/client/new_app/src/caption_videos/HomepageIntroCC.mp4'
import video1 from '/Users/annikaneumann/codeclan_work/BeyondTravelling/beyond_travelling/client/new_app/src/caption_videos/HotelNearHospitalCC.mp4'
=======
import HotelList from './HotelList';
import HotelDetail from './HotelDetail';
>>>>>>> 9389ff6f9fc6e01b49f08f93ba872f63d8cc6b0d


const BSL = () => {
    // const [region, setRegions] = useState([]);
    // const [selectedRegion, setSelectedRegion] = useState(null);

<<<<<<< HEAD

    useEffect(() => {
        getRegions();
    }, [])


    const getRegions = function(){
        fetch('http://localhost:8080/countries')
        .then(res => res.json())
        .then(regions => setRegions(regions))
    }
=======
    // useEffect(() => {
    //     getRegions();
    // }, [])

    // const getRegions = function(){
    //     fetch('http://localhost:8080/countries')
    //     .then(res => res.json())
    //     .then(regions => setRegions(regions))
    // }
>>>>>>> 9389ff6f9fc6e01b49f08f93ba872f63d8cc6b0d

    // const onRegionClick = function(region){
    //     setSelectedRegion(region);
    // }

    // const onHotelSelected = function(hotel){
    //     setSelectedHotel(hotel);
    // }
    

    return (
        // <div>
        <div className="main-container">
<<<<<<< HEAD
            {/* <HotelList regions={region} onRegionClick={onRegionClick} />
            {selectedRegion ? <HotelDetail selectedRegion={selectedRegion} /> : null}
            <AccessibleHotels /> */}

{/* if we want to render two videos on the same page, need to create 2 returns as below and above from import */}
{/* React Player not even needed, can use html/jsx video tag */}
            <video width="750" height="500" controls autoPlay muted>
            <source src={video} type="video/mp4"/>
            </video>

            <video width="750" height="500" controls autoPlay muted>
            <source src={video1} type="video/mp4"/>
            </video>

            </div>
        
=======
            <h1>BSL Hotels here</h1>
            {/* <HotelList regions={region} onRegionClick={onRegionClick} /> */}
            {/* {selectedRegion ? <HotelDetail selectedRegion={selectedRegion} /> : null} */}
            
        </div>
>>>>>>> 9389ff6f9fc6e01b49f08f93ba872f63d8cc6b0d
    )
};

export default BSL;

