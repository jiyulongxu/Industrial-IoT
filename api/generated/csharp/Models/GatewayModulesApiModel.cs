// <auto-generated>
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Azure.IIoT.Opc.Registry.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    /// <summary>
    /// Gateway modules model
    /// </summary>
    public partial class GatewayModulesApiModel
    {
        /// <summary>
        /// Initializes a new instance of the GatewayModulesApiModel class.
        /// </summary>
        public GatewayModulesApiModel()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the GatewayModulesApiModel class.
        /// </summary>
        public GatewayModulesApiModel(SupervisorApiModel supervisor = default(SupervisorApiModel), PublisherApiModel publisher = default(PublisherApiModel), DiscovererApiModel discoverer = default(DiscovererApiModel))
        {
            Supervisor = supervisor;
            Publisher = publisher;
            Discoverer = discoverer;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "supervisor")]
        public SupervisorApiModel Supervisor { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "publisher")]
        public PublisherApiModel Publisher { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "discoverer")]
        public DiscovererApiModel Discoverer { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="Rest.ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Supervisor != null)
            {
                Supervisor.Validate();
            }
            if (Publisher != null)
            {
                Publisher.Validate();
            }
            if (Discoverer != null)
            {
                Discoverer.Validate();
            }
        }
    }
}
